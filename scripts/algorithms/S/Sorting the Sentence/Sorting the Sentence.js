var sortSentence = function(s) {
    let sortingS = s.split(' ').sort((a,b) => a.substr(-1) - b.substr(-1));
    slicingS = sortingS.map(word => word.slice(0, -1));
    return slicingS.join(' ');
};
